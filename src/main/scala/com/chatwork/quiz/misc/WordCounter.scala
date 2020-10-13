package com.chatwork.quiz.misc

/**
  * ワードをカウントするオブジェクト。
  */
object WordCounter {

  /**
    * 文字列から単語数をカウントする。
    *
    * @param words 文字列
    * @return 単語がキー、単語数がヴァリューのマップ
    */
  def countWords(words: List[String]): Map[String, Int] = {
//    Map(
//      "banana" -> 1,
//      "muscat" -> 1,
//      "orange" -> 3,
//      "mango"  -> 2,
//      "apple"  -> 3,
//      "kiwi"   -> 1,
//      "papaya" -> 1
//    )
    words.flatMap(f=>f.split(" ")).groupBy(identity).view.mapValues(_.size).toMap

  }

}
