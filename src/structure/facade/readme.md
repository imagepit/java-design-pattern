# Facade

## メモ

## 練習問題

### 問題15-1

- 将来の拡張やプログラムの改善に備えてpagemakerパッケージの外から利用できるのはPageMakerクラスだけにしたいとクラス設計者は考えました。
- DatabaseクラスとHtmlWriterクラスをpagemakerパッケージの外から利用できないようにするにはサンプルプログラムをどのように変更したらいいですか。

### 問題15-2

- maildata.txtに含まれているユーザのメールアドレスのリンク集を作成するmakeLinkPageメソッドをPageMakerクラスに追加してください。
- 呼び出しは次のようになります。

_Main.java_

```java
import pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeLinkPage("linkpage.html");
    }
}
```

_javaファイルのコンパイル_

```cmd
javac Main.java
java Main
linkpage.html is created.
```

- 作成されるリンク集はhtmlは次のようになります。

_linkpage.html_

```html
<html><head><title><Link page></title></head><body>
<h1>Link page</h1>
<p><a href="mailto:hanako@hyuki.com">Hanako Sato</a></p>
<p><a href="mailto:mamoru@hyu]ci.com">MainoruTakahashi</a></p>
<p><a href="mailto:hyuki@hyuki.com">Hiroshi Yuki</a></p>
<p><a href="mailto:tomura@hyuki.com">Tomura</a></p>
</body></html>
```
