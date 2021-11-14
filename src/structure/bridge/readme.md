# Bridge

## メモ

## 練習問題

### 問題9-1

- 本章のサンプルプログラムにクラスを追加して「ランダム回数表示する」という処理を実現してください。
- その際にどのクラスを拡張するかを意識しましょう。
- 【ヒント】表示のメソッドは`void randomDisplay(int times)`とし0以上times未満だけランダムに表示するとします。

### 問題9-2

- 本章のサンプルプログラムにクラスを追加して「テキストファイルの内容を表示する」という処理を実現してください。
- その際にどのクラスを拡張するかを意識しましょう。

### 問題9-3

- 次のような模様を表示するクラスを本章のサンプルプログラムに追加するとします。

_模擬例1_

```
<>
<*>
<**>
<***>
```

_模擬例2_

```
|-
|##-
|####-
|######-
|########-
|##########-
```

- これらの模様ははじめの文字—飾り文字が複数回-*終わりの文字と改行を1行として、それが数行繰り返されるものとなっています。
- 繰り返すごとに、だんだん 飾り文字の個数が増えていきます。 
- 以上のような動きをするクラスをサンプルプログラムに追加するとき機能のクラス階層に入れるべきでしょうか。
  - それとも実装のクラス階層に入れるべきでしょうか。
  - 新しい表示の方法を追加するのだから機能のクラス階層でしょうか。 
  - それとも、文字を使った表示を追加するのだから実装のクラス階層でしょうか。 
- どうしたらBridgeバターンに収まるかを考えてください。