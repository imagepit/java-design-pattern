# Builder

## メモ

## 練習問題

### 問題7-1

- サンプルプログラムのBuilderクラス（List7-1)をインタフェースに変更しそれにあわせて他のクラスを修正してください。

### 問題7-2

- サンプルプログラムのHTMLBuilderクラスではmakeTitleメソッドを最初に呼び出す必要がありますがTextBuilderクラスではメソッドを呼び出す順序に制限はありません。
- Builderクラス、TextBuilderクラス、HTMLBuilderクラスを修正して「makeStringメソッド、makelternsメソッド、closeメソッドが呼び出される前に、一度だけmakeTitleメソッドが呼び出されなければならない」ことを保証するようにしてください。

### 問題7-3

- サンプルプログラムのBuilderクラスのサブクラスとしてConcreteBuilder役をつとめるクラスを作ってください。
- プレーンテキスト、HTMLファイル以外なら、題材は自由です。

### 問題7-4

- TextBuilderクラスで文書を構築していくフィールドbufferがStringクラスではなくStringBufferクラスになっている理由は何ですか。
- Stringを使った場合、何かまずいことはあるでしようか。

