export interface Person{
    id: number;
    firstname: string;
    lastname: string;
    email: string;
    address: string;
    city: string;
    password: string;
    secret: string;
    expiryDate: Date;
    token: string;
    email_verification_attempts: number;
    email_verification_hash: string;
    status: string;
    dtype: string;
    avatar: string;
    image: string;
}