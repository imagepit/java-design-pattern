# Abstruct Factory

## メモ

## 練習問題

### 問題8-1

- Trayクラス（List 8-3)ではtrayフィールドがprotectedとして定義されており、サブクラスから參照できるようになっています。
- これをprivateにした場合の良い点、悪い 点をそれぞれ指摘してください。

### 問題8-2

- サンプルプログラムのFactoryクラスに「Yahoo! (http://www.yahoo.com/) のリンクのみからなるページを作成する具象メソッド」`public Page createYahooPage()`を定義してください（ページの作者とタイトルはどちらも"Yahoo!"とします）。
  - このとき具体的な工場や具体的な部品の方にはどのような変更が必要になりますか。

### 問題8-3

- ListLinkクラス（List 8-8)のコンストラクタを見ると次のようになっています。

```java
public ListLink(String caption, String url){
    super(caption, url);
}
```

- つまりやっていることはスーパークラスのコンストラクタを呼んでいるだけです。
- 特別な処理が不要ならどうしてわざわざListLinkのコンストラクタを定義しているのでしようか。

## 問題8-4

- PageクラスはTrayクラスと似た働きをしています。
- それなのになぜPageクラスをTrayクラスのサブクラスにしなかったのでしようか。

