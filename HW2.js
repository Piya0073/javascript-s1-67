let furniture = ['Table', 'Chairs', 'Couch'];

furniture.forEach(item => {
    console.log(`Letters in "${item}":`);
    item.split('').forEach(letter => {
        console.log(letter);
    });
    console.log('---'); // Separator for better readability
});