# Observer

## メモ

## 練習問題

### 問題17-1

- NumberGeneratorクラスを拡張して数がだんだん増加していく機能を持つIncrementalNumberGeneratorというサブクラスを作ってください。
- コンストクラタの引数として次の3個のintを渡すことにします。
  - 開始する数
  - 終了する数（この数を含まない)
  - 増加分
- そしてDigitObserverクラスとGraphObserver クラスに動作を観察させるプログラムを作ってください。
- IncrememtalNumberGeneratorクラスは次のように使うものとします。

_Main.java_

```java
public class Main {
    public static void main(String[] args){
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
```

- 実行結果を次に示します。
- 10以上50未満の数が5刻みで表示されています。

_実行結果_

```cmd
DigitObserver:10
GraphObserver:**********
DigitObserver:15
GraphObserver:***************
DigitObserver:20
GraphObserver:********************
DigitObserver:25
GraphObserver:*************************
DigitObserver:30
GraphObserver:******************************
DigitObserver:35
GraphObserver:*********************************** 
DigitObserver:40 
GraphObserver:****************************************
DigitObserver:45
GraphObserver:*********************************************
```