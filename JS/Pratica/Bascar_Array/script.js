const booksByCategory = [
    {
        category: "Riqueza",
        books:[
            {
                title:"Os segredos da mente milionaria",
                author:"T. Harv Eker"
            },
            {
                title:"O Homem mais rico da Babilônia",
                author:"George S. Clason"
            },
            {
                title:"Pai rico, pai pobre",
                author:"Robert T. Kiyosaki e Sharon L. Lachter"
            }
        ]
    },
    {
        category: "Inteligência Emocional",
        books:[
            {
                title:"Você é Insubstituível",
                author:"Augusto Cury"
            },
            {
                title:"Ansiedade - Como enfrentar o mal do Século",
                author:"Augusto Cury"
            },
            {
                title:"Os 7 hábitos das pessoas altamente aficazes",
                author:"Stephen R. Covey"
            }
        ]
    }  
];

const categoryNumber = booksByCategory.length;

console.log(categoryNumber);

for(let category of booksByCategory){
    console.log('categoria: ', category.category);
    console.log('quantidade de livros: ', category.books.length);
}

function countAuthors(){
    let authors = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(authors.indexOf(book.author) == -1){
                authors.push(book.author);
            }
        }
    }

    console.log('total de autores', authors.length)
}

countAuthors();

function booksOfAuthor(author){
    let books=[];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(book.author === author){
                books.push(book.title);
            }
        }
    }

    console.log(`livros do author ${author}: ${books.join(", ")}`);
}

booksOfAuthor('Augusto Cury');