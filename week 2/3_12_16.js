const status  = 700

switch (status) {
    case 200:
        console.log('ok');
        break;
    case 400:
    case 500:
        console,log('error');
        break;
    default:
        console.log('Unknown status');
}