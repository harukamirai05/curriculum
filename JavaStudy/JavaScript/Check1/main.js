//問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください
//関数を定義するときにまず必要となってくるのが、function（関数の意）です。それに続けて関数につける名前を書き、{  }のなかに処理を書きます。一番シンプルに書くとこのようになります。
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(num) {
    for(let i = 0; i < num.length; i++) {
        if(num[i] % 2 == 0) {
            console.log(num[i] + 'は偶数です');
        }
    }
}
isEven(numbers);


function is(number){
    if(number % 2 == 0){
    console.log(number + 'は偶数です');
    }
}

for (var i = 0; i <  numbers.length; i++) {
    is(numbers[i]);
}


/*問2:以下の要件を満たすように実装してください。
【要件】
・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
*/
class car {
    constructor(gas,num) {
        this.gas = gas;
        this.num = num;
    }
    getNumGas() {
        console.log('ガソリンは' + this.gas + 'です。ナンバーは' + this.num + 'です');
    }
}

    let c = new car(100,9000);
    c.getNumGas();

    let c2 = new car(1000,90000);
    c2.getNumGas();
    
