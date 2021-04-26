package com.weitian.wanapp.network
// 首页文章列表（包含了所有的文件）
data class ArticleSum (

    val curPage : Int,
    val datas : List<Article>,
    val offset : Int,
    val over : Boolean,
    val pageCount : Int,
    val size : Int,
    val total : Int
)
