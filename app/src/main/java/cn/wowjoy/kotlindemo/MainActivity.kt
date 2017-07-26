package cn.wowjoy.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    var View.padLeft : Int
        set(value){

            setPadding(value,paddingTop,paddingRight,paddingBottom)

        }
        get(){

            return paddingLeft
        }

//    fun sum(a:Int, b: Int) = a +b

    public fun sum(a:Int,b:Int) : Int = a+b;

    fun printSum(a:Int ,b:Int) : Unit {

        print(a + b);

    }

    fun  vars (vararg v:Int){

        for (vt in v){
            print(vt)
        }

    }



    fun maina(args: Array<String>){
        val sumLambda : (Int ,Int) -> Int = {x,y -> x+y}
        println(sumLambda(3,4))
        val c : Int
        c = 1
        val a : Int = 1
        val b = 1

        var d = 1
        d+=1

    }

    fun parseInt (a:String) : String?{


        return a
    }

    fun checkType(a : Any) : Int?{

        if(a is Int){

            return a
        }

        return null

    }

    open class Base( var baseInt : Int ,var baseStr : String){

    }


    class Some(baseInt : Int ,baseStr : String) : Base(baseInt,baseStr) {


    }

    fun main(args : Array<String>){

        var bigWhite = Some(24,"大白")
        println("bigWhite age = ${bigWhite.baseInt}")
        println("bigWhite name = ${bigWhite.baseStr}")


    }



}
