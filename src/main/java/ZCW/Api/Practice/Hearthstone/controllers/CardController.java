package ZCW.Api.Practice.Hearthstone.controllers;

import ZCW.Api.Practice.Hearthstone.models.*;
import ZCW.Api.Practice.Hearthstone.services.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class CardController {

    private CardService service;

    @Autowired
    public CardController(CardService service) { this.service = service; }

    @GetMapping("/cards/{classname}")
    public ResponseEntity<?> getClassCards(@PathVariable String classname) {
        HttpResponse<String> response = Unirest.get("https://omgvamp-hearthstone-v1.p.rapidapi.com/cards/classes/" + classname)
                .header("x-rapidapi-host", "omgvamp-hearthstone-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "4c4e379b8cmsh5b8ee3f43ccd278p1a858cjsn82edf9884af0")
                .asString();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<HearthCard> cards = objectMapper
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .readValue(response.getBody(), new TypeReference<List<HearthCard>>(){});
            if (cards.size() > 0) { return new ResponseEntity<>(cards, HttpStatus.OK); }
            else { return new ResponseEntity<>(null, HttpStatus.NO_CONTENT); }
        } catch (JsonProcessingException ignored) {}
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
