package com.example.pruebacontinua

class Book(titulo:String, pag:Int, autor:String, publi:Int) {
    private var titulo=""
    private var pag=0
    private var autor=""
    private var publi=0
    init {
        this.titulo=titulo
        this.pag=pag
        this.autor=autor
        this.publi=publi
    }
    fun setTitulo(titulo:String){
        this.titulo=titulo
    }
    fun setPag(pag:Int){
        this.pag=pag
    }
    fun setAutor(autor:String){
        this.autor=autor
    }
    fun setPubli(publi:Int){
        this.publi=publi
    }
    fun getTitulo():String{
        return titulo
    }
    fun getPag():Int{
        return pag
    }
    fun getAutor():String{
        return autor
    }
    fun getPubli():Int{
        return publi
    }
}