public class subject {
  static String text[] = { "c", "b", "p", "a", "x", "a", "b", "c", "a", "b", "c", "f", "a", "a", "c"};
  static String pattern[] = {"a","b","c", "f"};
// 最初の文字と一致するのを見つけるプログラム
  public static void main(String[] args ) {
    System.out.println(""+checkNCharacters());
  }

  //最初の文字から配列のnばんめと一致する文字列を見つけるプログラム
  public static Boolean checkNCharacters() {
    boolean characterFound = false;
    int n ;
      for (int i=0; i < text.length; i++) {
          for (n=0; n < pattern.length ; n++ ) {
            if (text[i+n] != pattern[0+n]) {
              break;
            } else if(n==pattern.length-1) {
              System.out.println("要素数が"+(i+1)+"ばんめのところから"+(i+pattern.length)+"番目の所にあります");
              characterFound = true;
              return characterFound;
            }
          }
       }
    return characterFound;
  }

  // 配列の最初から2文字と一致する文字列を見つけるプログラム
  public static Boolean check2Characters() {
    boolean characterFound = false;
    // andの入れ子で書いた場合。
    int j =0;
    for (int i=0; i < text.length; i++) {
    if (text[i].equals(pattern[j])&& text[i+1].equals(pattern[j+1])) {
      characterFound  = true;
      System.out.println("要素数が"+(i+1)+"ばんめのところと"+(i+2)+"番目の所にあります");
      return characterFound;
      }
    }

    // ifの条件分岐で書いた場合。
    // int j =0;
    // for (int i=0; i < text.length; i++) {
    //   if(text[i].equals(pattern[j])){
    //     if(text[i+1].equals(pattern[j+1])) {
    //       characterFound  = true;
    //       System.out.println("要素数が"+(i+1)+"ばんめのところと"+(i+2)+"番目の所にあります");
    //       return characterFound;
    //     }
    //   }
    // }

    return characterFound;
  }

  // 最初の文字と一致するのを見つけるプログラム
  public static Boolean checkFirstCharacter() {
    boolean characterFound = false;
    for (int i=0; i < text.length; i++) {
      if (text[i] == pattern[0] ) {
        System.out.println("要素数が"+(i+1)+"ばんめのところにあります。");
        characterFound = true;
        return characterFound;
      }
    }
    System.out.println("見つかりませんでした");
    return characterFound;
  }

  // //2文字の連続する文字列を探すプログラム
  // public static void check2Characters() {
  //   if(checkFirstCharacter()) {

  //   }
  // }

}




