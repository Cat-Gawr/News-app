from flask import render_template
from . import main
from ..request import news,sources,get_articles,get_sources
@main.route("/")
def index():
    top_news=news("top-headlines")
    print(top_news)
    source=sources("sources")
    return render_template("index.html",top_headline=top_news,sources=source)

@main.route("/articles/<name>")
def body(name):
    bbc=get_articles("abc-news")
    abc=get_articles("abc-news-au")
    aljezera=get_articles("al-jazeera-english")
    technica=get_articles("ars-technica")

    return render_template("articles.html",name=name,bbc_news=bbc,abc_news=abc,aljezera_n=aljezera,tech=technica)
