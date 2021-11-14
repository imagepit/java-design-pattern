# Template Method

## メモ

## 練習問題

### 問題3-1

- `java.io.InputStream`クラスではTemplate Methodパターンが使われています。
- 仕様書（JDKのAPIリファレンス）を読んでjava.io.InputStreamのサブクラスで実装することが要請されているメソッドは何かを調べてください。

### 問題3-2

- サンプルプログラムのAbstractDisplayクラスのdisplayメソッドは下記として実装されています。
- ここにはfinalと書かれていますがこれはどのようなことを表していますか。

```java
public final void display() {
```

### 問題3-3

- サンプルプログラムでopen, print, closeメソッドを継承関係および同一パッケージにあるクラスからのみ呼び出せるようにし無閨係な他のクラスからは呼び出せないようにしたいとします。
  - どうしたらいいですか。

### 問題3-4

- Javaのインターフェースは抽象クラスとよく似ています。
- インターフェースも抽象メソッドの集まりですがTemplate MethodパターンではAbstractClass役にインターフェースを使うことはできません。
  - なぜですか。
