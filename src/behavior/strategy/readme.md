# Strategy

## メモ

## 練習問題

### 問題10-1

- でたらめに次の手を出すRandomStrategyクラスを作ってください。

### 問題10-2

- 本章のサンプルプログラム中Handクラスのfightメソッドでは引き分けの判定をするのに、

```java
this.handvalue == h.handvalue
```

という式ではなく、次の式を使っています。

```java
this == h
```

なぜ、これでうまくいくのでしようか。

### 問題10-3

ある人がWinningStrategyクラス)をプログラミングするときにwonフイ一ルドを、

```java
private boolean won = false;
```

ではなく、

```java
private boolean won;
```

と書いてしまいました。 しかし、=falseをつけたときとまったく同じ動作をしました。なぜですか。

### 問題10-4

- 以下のプログラムはソートを行うためのクラスとインタフェースです。

_Sorter.java_

```java
public interface Sorter {
    void sort(Comparable[] data);
}
```

_SelectionSorter.java_

```java
public class SelectionSorter implements Sorter {
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            Comparable passingplace = data[min];
            data[min] = data[i];
            data[i] = passingplace;
        }
    }
}
```

_SortAndPrint.java_

```java
public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    public void execute() {
        print();
        sorter.sort(data);
        print();
    }
    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
```

_Main.java_

```java
public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
    }
}
```

- このプログラムの実行結果は次のようになります。

_実行結果_

```text
Dumpty, Bowman, Carroll, Elfland, Alice, 
Alice, Bowman, Carroll, Dumpty, Elfland, 
```

- ここではアルゴリズムとして選択ソート（selectionsort)を用いています。
- 別のアルゴリズム（何でもよい）を表現するクラスをSorterのインタフェースにあわせて作ってください。
