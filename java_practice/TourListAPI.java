public class TourListAPI {
    public static void main(String[] args) {
        @Override
	public void tourLists() throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/6260000/AttractionService/getAttractionKr"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=o5qKZe2j9oe7vmdAxcZZN0KcEuO3a1rxqX%2Bcb4UO4BNvR7DiZsBK47AMFktXFNWu9%2BaaPKhVoKGLksmQ2iVN3Q%3D%3D"); /*
																														 * Service
																														 * Key
																														 */
		urlBuilder.append("&" + URLEncoder.encode("resultType", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* JSON방식으로 호출 시 파라미터 resultType=json 입력 */

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		log.info("Response code: " + conn.getResponseCode());

		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		String result = sb.toString();
		log.info("result : " + result);

		// Json parser를 만들어 만들어진 문자열 데이터를 객체화
		try {
			JSONParser parser = new JSONParser();
			JSONObject obj;
			obj = (JSONObject) parser.parse(result);
			// response 키를 가지고 데이터를 파싱
			JSONObject parse_response = (JSONObject) obj.get("response");
			// response 로 부터 body 찾기
			JSONObject parse_body = (JSONObject) parse_response.get("body");
			// body 로 부터 items 찾기
			JSONObject parse_items = (JSONObject) parse_body.get("items");

			JSONArray parse_item = (JSONArray) parse_items.get("item");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
    }
}
