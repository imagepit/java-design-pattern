# Factory Method

## メモ

## 練習問題

### 問題4-1

- サンプルプログラムではIDCardクラス（List4-3)のコンストラクタはpublicになっていません。
- これは何を表しているでしょうか。

```java
public class IDCard extends Product {
    :
    IDCard(String owner) { 
        :
        this.owner = owner;
    }
    :
}
```

### 問題4-2

- サンプルプログラムのIDCardクラスにカードの通し番号をつけIDCard Factoryクラスが通し番号と所持者の対応表を持つように修正してください。

### 問題4-3

- Productクラスのサブクラスではコンストラクタで必ず「製品の名前」 を引数として与えることを強制しようと思って、以下のようにProductクラスを定義しました。
- しかしコンパイル時にエラーになりました。なぜですか。

```java
public abstract class Product {
    public abstract Product(String name); 
    public abstract void use();
}
```