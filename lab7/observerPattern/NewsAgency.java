package lab7.observerPattern;

public class NewsAgency extends Subject {
	public void publishNews(String news) {
		notifyObservers(news);
	}

}
