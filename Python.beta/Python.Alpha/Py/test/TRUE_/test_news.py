import unittest
from app.models import News


class TestNews(unittest.TestCase):
    '''
    Test the behavoiur of the News class
    '''
    def setUp(self):
        #will run before every test
        self.new_news=News("kenyan gazette","I was established in the year  1954","https://newsapi.org/v2/sources","Kenyatta and some colonial government","https://kenya.org.com")

    def test_instance(self):
        self.assertTrue(isinstance(self.new_news,News))

    '''
    Test our  News movie if it is initialized correctly
    '''
    def self_init(self):
        self.assertEqual(self.new_news.title,"kenyan gazette")
        self.assertEqual(self.new_news.description,"I was established in the year  1954")
        self.assertEqual(self.new_news.urlToImage,"https://newsapi.org/v2/sources")
        self.assertEqual(self.new_news.content,"Kenyatta and some colonial government")
        self.assertEqual(self.new_news.url,"https://kenya.org.com")
