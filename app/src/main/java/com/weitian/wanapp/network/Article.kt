package com.weitian.wanapp.network

// 首页文章单项
data class Article (

    val apkLink : String,
    val audit : Int,
    val author : String,
    val canEdit : Boolean,
    val chapterId : Int,
    val chapterName : String,
    val collect : Boolean,
    val courseId : Int,
    val desc : String,
    val descMd : String,
    val envelopePic : String,
    val fresh : Boolean,
    val host : String,
    val id : Int,
    val link : String,
    val niceDate : String,
    val niceShareDate : String,
    val origin : String,
    val prefix : String,
    val projectLink : String,
    val publishTime : Int,
    val realSuperChapterId : Int,
    val selfVisible : Int,
    val shareDate : Int,
    val shareUser : String,
    val superChapterId : Int,
    val superChapterName : String,
    val tags : List<String>,
    val title : String,
    val type : Int,
    val userId : Int,
    val visible : Int,
    val zan : Int
)