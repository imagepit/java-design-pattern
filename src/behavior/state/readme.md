# State

## メモ

## 練習問題

### 問題19-1

- Contextをインタフヱースではなく抽象クラスにしてstateフィールドをContextクラスに持たせた方がパターンの主旨に合っているはずなのにサンプルプログラムではContext役をContextインターフェースで表現しstateフィ一ルドはSafeFrameクラスに持たせています。
  - その理由は何ですか。

### 問題19-2

- サンプルプログラムで昼間と夜間の時刻の範囲を次のように変更するとします。
- ソースプログラムのうちどこを修正する必要がありますか。

**現在**

昼間|夜間
---|---
9:00 〜16:59|17:00 〜23:59および0:00 〜8:59
  
変更

昼間|夜間
---|---
8:00 〜20:59|21:00 〜23:59 および0:00 〜7:59

### 問題19-3

- サンプルプログラムに「昼食時」（12:00〜12:59)という以下のような新しい状態を追加してください。
  - 昼食時、金庫を使用すると警備センターに非常事態の通報が行く
  - 昼食時、非常べルを使用すると、警備センターに非常べルの通報が行く
  - 昼食時、電話を使用すると、警備センターの留守録が呼び出される

### 問題19-4

- サンプルプログラムに「非常時」という以下のような新しい状態を追加してください。
- こうしておけば非常時には、時刻によらず警備センターに連絡がつくようになります。 
  - 非常べルを押すと、非常時という状態に遷移する 
  - 非常時、金庫を使用すると、警備センターに非常事態の通報が行く（時刻によらず）
  - 非常時、非常べルを使用すると、警備センターに非常べルの通報が行く（時刻によらず）
  - 非常時、電話を使用すると、警備センターが呼び出される（時刻によらず）
- ただしこの仕様には問題点があります。それは何ですか。