import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Person } from './Person';
import { PersonService } from './person.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public persons: Person[];
  public editPerson: Person;
  public deletePerson: Person;

  constructor(private personService: PersonService) { }
  
  // when component is initialized load all persons 
  ngOnInit() {
    this.getPersons();
  }

  public getPersons(): void {
    this.personService.getPersons().subscribe(
      (response: Person[]) => {
        this.persons = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onAddPerson(addForm: NgForm): void {
    document.getElementById('add-person-form').click();
    this.personService.addPerson(addForm.value).subscribe(
      (response: Person) => {
        console.log(response);
        this.getPersons();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }

  public onUpdatePerson(person: Person): void {
    this.personService.updatePerson(person).subscribe(
      (response: Person) => {
        console.log(response);
        this.getPersons();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onDeletePerson(personId: number): void {
    this.personService.deletePerson(personId).subscribe(
      (response: void) => {
        console.log(response);
        this.getPersons();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public searchPerson(key: string): void {
    console.log(key);
    const results: Person[] = [];
    for (const person of this.persons) {
      if (person.firstname.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || person.lastname.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || person.email.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        results.push(person);
      }
    }
    this.persons = results;
    if (results.length === 0 || !key) {
      this.getPersons();
    }
  }

  public onOpenModal(person: Person, mode: string): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add') {
      button.setAttribute('data-target', '#addPersonModal');
    }
    if (mode === 'edit') {
      this.editPerson = person;
      button.setAttribute('data-target', '#updatePersonModal');
    }
    if (mode === 'delete') {
      this.deletePerson = person;
      button.setAttribute('data-target', '#deletePersonModal');
    }
    container.appendChild(button);
    button.click();
  }
  }

