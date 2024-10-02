fetch('https://www.fruityvice.com/api/fruit/all')
  .then(response => response.json())
  .then(data => {
    const qtd = Math.floor(Math.random() * data.length) + 1;
    console.log(`Número aleatório: ${qtd}`);
    data.forEach(fruit => console.log(fruit.name));
  })
  .catch(error => console.error('Erro:', error));