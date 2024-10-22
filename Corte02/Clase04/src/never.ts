function voidFunc(): void {
  console.log("Void Call!!");
}

console.log(voidFunc);

async function infnite(): never {
  while (true) {
    await new Promise<void>((res) =>
      setTimeout(() => {
        console.log("no end");
        res();
      }),
    );
  }
}

infnite()
