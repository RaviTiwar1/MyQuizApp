package com.learning.myquizapp

import java.util.TreeSet

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
         val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_argentina,"Argentina","Australia",
            "Armenia","Austria",1
        )
        questionsList.add(que1)

        val que2 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_australia,"Argentina","Australia",
            "Armenia","Austria",2
        )
        questionsList.add(que2)

        val que3 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_belgium,"Pakistan","Australia",
            "Armenia","Belgium",4
        )
        questionsList.add(que3)

        val que4 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_brazil,"India","Denmark",
            "Brazil","Austria",3
        )
        questionsList.add(que4)

        val que5 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_fiji,"Fiji","Australia",
            "Palestine","Kuwait",1
        )
        questionsList.add(que5)

        val que6 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_germany,"Argentina","China",
            "Armenia","Germany",4
        )
        questionsList.add(que6)

        val que7 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_india,"Argentina","India",
            "Armenia","Austria",2
        )
        questionsList.add(que7)

        val que8 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_denmark,"Denmark","Australia",
            "Israel","Austria",1
        )
        questionsList.add(que8)

        val que9 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_kuwait,"Argentina","Austria",
            "Kuwait","None Of The Above",3
        )
        questionsList.add(que9)


        return questionsList
    }

}