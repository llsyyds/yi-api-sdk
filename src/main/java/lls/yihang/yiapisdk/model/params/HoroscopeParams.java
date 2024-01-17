package lls.yihang.yiapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: 每日星座运势
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
@Accessors(chain = true)
public class HoroscopeParams implements Serializable {
    private static final long serialVersionUID = 3815188540434269370L;
    /**
     * 十二星座对应英文小写，aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius, pisces
     */
    private String type;
    /**
     * 十二星座对应英文小写，aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius, pisces
     */
    private String time;
}
