# Adapter

## 練習問題

### 問題2-1

- サンプルプログラムではPrintBannerクラスのインスタンスを作るときに次のようにPrint型の変数に代入しています（List 2-4)。

```java
Print p = new PrintBanner("Hello");
```

- なぜ次のようにPrintBanner型の変数に代入しないのでしょう。

```java
PrintBanner p = new PrintBanner("Hello");
``` 

### 問題2-2

- `java.util.Properties`クラスはのようなキーとその値の組（プロパティ）を管理するためのものです。

```java
year=2004
month=4
day=21
```

- `java.util.Properties`クラスには、プロパティをストリームから読んだりストリームに書いたりするために次のメソッドが用意されています。

_プロパティの集合をInputStreamから読み込む_

```java
void load(InputStream in) throws IOException
```

_プロパティの集合をOutputStreamに書き込む(headerはコメント文字列)_

```java
void store(OutputStream out, String header) throws IOException 
```

- Adapterパターンを使ってプロパティの集合をファイルに保存する`FileProperties`クラスを作ってください。
  - ここでプロパティの集合をファイルに保存するメソッドはList2-7のFileIOインタフェース（Target役）で宣言するものとしFilePropertiesクラスはこのFileIOインターフェースを実装するとします。
  - 実行前の`file.txt`および実行後の`newfile.txt`は次のようになります。
  - `#`で始まる行は`java.util.Properties`クラスによって自動的に付加されるコメントです。
  - FilePropertiesクラスがあれば`java.util.Properties`クラスのメソッドについて知らなくてもFileIOインタフェースのメソッドさえ知っていればプロパティを扱えることになります。

_file.txt_

```properties
year=1999
```

_newfile.txt_

```properties
#written by FileProperties
#Mon Nov 20 10:27:07 JST 2000
day=20
year=2000
month=11
```