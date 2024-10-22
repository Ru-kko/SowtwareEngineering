enum PrintMedia {
  NewsPapper = 1,
  Newsletter = getMediaCode('Newsletter'),
  Magazine = Newsletter * 3,
  Book = 10
}

function getMediaCode(code: string):number{
  if (code === 'Newsletter') {
    return 5;
  }
  return 0;
}

console.log(PrintMedia.Newsletter);
console.log(PrintMedia.Magazine);

