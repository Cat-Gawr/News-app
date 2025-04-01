
class NewsController < ApplicationController
  def index
    @search_value = params[:search_term]
    if @search_value.nil?
      @news = News.top_news['articles']
      @heading = 'Top Headlines'
    else
      @news = News.search(@search_value)['articles']
      @heading = 'Search Results for: ' + @search_value
    end
  end

  def details
    @search_value = params[:search_term]
    @article_num = params[:article_num].to_i

    if @search_value == '' # For Top headlines search value is nil
      # An array of news articles(objects)
      @articles_array = News.top_news['articles']
      # A news article(object)
      @article = @articles_array[@article_num]
    else
      # An array of news articles(objects)
      @articles_array = News.search(@search_value)['articles']
      # A news article(object)
      @article = @articles_array[@article_num]
    end
  end
end
