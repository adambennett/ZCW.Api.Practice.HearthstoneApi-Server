package ZCW.Api.Practice.Hearthstone.models;

import javax.persistence.*;

@Entity
public class HearthCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long db_card_id;

    private String cardId;
    private String dbfId;
    private String name;
    private String cardSet;
    private String type;
    private String text;
    private String playerClass;
    private String locale;

    public HearthCard() {}

    public Long getDb_card_id() {
        return db_card_id;
    }

    public void setDb_card_id(Long db_card_id) {
        this.db_card_id = db_card_id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDbfId() {
        return dbfId;
    }

    public void setDbfId(String dbfId) {
        this.dbfId = dbfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
