// Acontece o içamento da variável (mesma coisa que jogar a variável para cima.)
console.log('a =', a)
var a = 2
console.log('a =', a)

// Mesmo resultado porém com função.
function teste() {
    console.log('a =', a)
    var a = 2
    console.log('a =', a)
}

teste()