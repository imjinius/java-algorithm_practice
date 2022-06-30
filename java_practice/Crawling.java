public class Crawling {
    public static void main(String[] args) {
        @Override
        // http://localhost:8088/map/restaurantLists
        public void restaurantLists() throws IOException {
    
            int pageNum = 1;
            String[] addrArr = null;
    
            for (int i = 0; i < 5; i++) {
                String url = "https://www.mangoplate.com/search/부산?keyword=부산&page="+ pageNum;
                log.info(url);
                Document doc = Jsoup.connect(url).get();
                //log.info(doc+"");
                Elements storeElements = doc.select("h2.title");
                Elements addrElements = doc.getElementsByClass("etc");
                Elements imgElements = doc.select("img.center-croping.lazy");
                for (int j = 0; j < storeElements.size(); j++) {
                    RestaurantVO vo = new RestaurantVO();
                    vo.setTitle(storeElements.get(j).text()); 
                    log.info("가게이름 : "+storeElements.get(j).text());
                    addrArr = addrElements.get(j).text().split(" ");
                    vo.setAddr(addrArr[1]); 
                    log.info("주소 : "+addrElements.get(j).text());
                    vo.setImg(imgElements.get(j).attr("data-original"));
                    log.info("이미지경로 : "+imgElements.get(j).attr("data-original"));
                    
                    dao.restaurant(vo);
                }
                pageNum++;
            }
    
        }
    }
}
