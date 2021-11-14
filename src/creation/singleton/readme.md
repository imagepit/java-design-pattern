# Singleton

## 学習メモ



---

## 演習問題

### 問題5-1

- 次のTicketMakerクラスは`getNextTicketNumber`メソッドを呼ぶたびに`1000,1001,1002,•••`という数を順に返すためのものです。
- チケットの番号やシリアルナンバーを生成するのに使います。 
- このTicketMakerクラスは現在のままではインスタンスをいくつでも作れてしまいます。
- これにSingletonパターンを当てはめてインスタンスが1個しか作れないようにしてください。

_TicketMaker.java_

```java
public class TicketMaker {
    private int ticket =1000;
    public int getNextTicketNumber(){
        return ticket++;
    }
}
```

---

### 問題5-2

- インスタンスの個数が3個に限定されているクラスTripleを作ってください。
- インスタンスには0,1,2という番号がついており`getInstance(int id)`でid番のインスタンスが得られるものとします。

---

### 問題5-3

- ある人がSingletonクラスをList5-4のように作りました。 
- しかしこれでは厳密にはSingletonパターンになりません。どうしてですか。

_Singleton.java_

```java
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance(){ 
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
```