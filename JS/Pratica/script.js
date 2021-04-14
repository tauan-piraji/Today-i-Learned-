/*
const person = {
    name: tauan,
    age: 23,
    weight: 91.6,
    isAdmin: true
}

const animals = [
    'monkey',
    'lion',
    'cat',
    {
        age: 3,
        name:'dog'
    }
]
console.log(`${person.name} tem ${person.age} anos`);
console.log(animals[3])
console.log(animals[4].age)
*/
let weight = 89;

console.log(typeof weight);

let name = 'tauan';
let age = 23;
let stars = 5.8;
let isSubscribed = true;

let student = {
    name: 'tauan',
    age: 23,
    stars: 5.8,
    isSubscribed: true
};

let John = {
    name: 'John',
    age: 23,
    stars: 5.8,
    isSubscribed: true
};

console.log(typeof student);

console.log(`${student.name} de idade ${student.age} pesa ${weight} Kg`);

let students = [];

students = [
    student
]

students[1] = John;

console.log(students[0])