function alterarCor(cor) {
    document.body.style.backgroundColor = cor;
    localStorage.setItem('corDeFundo', cor); // Armazena a cor escolhida
}
window.onload = function () {
    const corSalva = localStorage.getItem('corDeFundo');
    if (corSalva) {
        document.body.style.backgroundColor = corSalva;
    }
};

let formulario = document.getElementById('formulario');
let protocolo = document.getElementById('protocolo');
formulario.addEventListener('submit', function (event) {
    event.preventDefault();
    if (!protocolo.value.includes('10013-12345')) {
        alert('protocolo não encontrado!');
        protocolo.focus();
        return;
    }

    // Animação de saída
    document.body.classList.add('fade-out');
    setTimeout(() => {
        window.location.assign("Protocolo.html");
    }, 1000); // Tempo deve coincidir com o CSS
});