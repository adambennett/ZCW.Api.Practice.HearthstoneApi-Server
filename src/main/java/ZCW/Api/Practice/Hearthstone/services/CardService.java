package ZCW.Api.Practice.Hearthstone.services;

import ZCW.Api.Practice.Hearthstone.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class CardService {

    private CardRepository repo;

    @Autowired
    public CardService(CardRepository repo) { this.repo =  repo; }



}
