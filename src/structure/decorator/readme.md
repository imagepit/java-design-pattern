# Decorator

## メモ

## 練習問題

### 問題12-1

- 本章のサンプルプログラムに追加する形で上下に飾り文字がついたUpDownBorderクラスを作ってください。
- UpdownBorderクラスは次のように使うものとします。

```java
public class Main {
    public static void main(String[] args) {
        Display b1 =new StringDisplay("Hello, world.");
        Display b2 = new UpDownBomer (b1,'*');
        Display b3 = new SideBorder(b2, '*');
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
            new FullBorder(
                new UpDownBorder(
                    new SideBorder(
                        new UpDownBorder(
                            new SideBorder(
                                new StringDisplay("こんにちは。"),
                                '*'
                            ),
                            '|'
                        ),
                        '/'
                    )
                )
            );
        b4.show();
    }
}
```

- 実行結果は次のとおりです。

_実行結果_

```
Hello, world.
-------------
Hello, world.
-------------
*-------------*
*Hello, world.*
*-------------*
+---------------+
|///////////////|
||=============||
||*こんにちは。 *||
||=============||
|///////////////|
+---------------+
```

### 問題12-2

- ConcreteComponent役として複数の文字列を表示するMultiStringDisplayクラスを作ってください。
- 次のように使うものとします。実行結果をFig.12-7に示します。

```java
public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();
        Display d1 = new SideBorder(md,'#'); 
        d1.show();
        Display d2 = new FullBorder(md);
        d2.show();
    }
}
```