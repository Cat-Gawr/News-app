import urllib.request,json
from .models import News,Sources,Articles

api_key=None
base_url=None
source_url=None
article_url=None

def configure_request(app):
    global api_key,base_url,source_url,article_url
    api_key=app.config["NEWS_API_KEY"]
    base_url=app.config["NEWS_API_BASE_URL"]
    source_url=app.config["NEWS_BASE_URL"]
    article_url=app.config["NEWS_ARTICLE_API"]
def news(headlines):
    get_news_url=base_url.format(headlines,api_key)
    with urllib.request.urlopen(get_news_url) as url:
        get_news_data=url.read()
        get_news_response=json.loads(get_news_data)

        news_results=None

        if get_news_response['articles']:
            news_result_list=get_news_response["articles"]
            news_results=process_results(news_result_list)

    return news_results

def process_results(news_list):
    news_results=[]
    for news in news_list:

        title=news.get("title")
        description=news.get("description")
        urltoImage=news.get("urlToImage")
        content=news.get("content")
        url=news.get("url")
        if description and urltoImage:

            news_object=News(title,description,urltoImage,content,url)

            news_results.append(news_object)
            news_results=news_results[:6]
    return news_results
'''
Getting various sources
'''
def sources(sources):
    get_news_url=source_url.format(sources,api_key)
    with urllib.request.urlopen(get_news_url) as url:
        source_data=url.read()
        source_response=json.loads(source_data)

        source_results=None

        if source_response["sources"]:
            new_source_results=source_response["sources"]
            source_results=process_sources(new_source_results)
    return source_results

def process_sources(source_list):
    source_results=[]
    for source in source_list:
        id=source.get("id")
        name=source.get("name")
        description=source.get("description")
        url=source.get("url")

        source_object=Sources(id,name,description,url)
        source_results.append(source_object)
        source_results=source_results[:4]

    return source_results

'''
Fetching Articles
'''
def get_articles(name):
    get_articles_url=article_url.format(name,api_key)
    with urllib.request.urlopen(get_articles_url) as url:
        article_data=url.read()
        article_response=json.loads(article_data)

        article_object=None;

        if article_response['articles']:
            at_result_list=article_response["articles"]
            at_results=process_articles(at_result_list)
    return at_results


def process_articles(article_list):
    article_results=[]
    for article in article_list:
        title=article.get("title")
        description=article.get("description")
        urlToImage=article.get("urlToImage")
        url=article.get("url")
        publishedAt=article.get("publishedAt")

        article_object=Articles(title,description,urlToImage,url,publishedAt)
        article_results.append(article_object)

    return article_results

def get_sources(name):
    get_articles_details_url=article_url.format(name,api_key)

    with urllib.request.urlopen(get_articles_details_url) as url:
        news_details_data=url.read();
        news_details_response=json.loads(news_details_data)

        news_object=None
        if news_details_response:
            title=news_details_response.get("title")
            description=news_details_response.get("description")
            urlToImage=news_details_response.get("urlToImage")
            url=news_details_response.get("url")
            publishedAt=news_details_response.get("publishedAt")

            news_object=Articles(title,description,url,urlToImage,publishedAt)
    return news_object
