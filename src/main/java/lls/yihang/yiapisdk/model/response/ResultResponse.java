package lls.yihang.yiapisdk.model.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: 通用返回类
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
@NoArgsConstructor
public class ResultResponse implements Serializable {
    private static final long serialVersionUID = -6486005224268968744L;
    private Map<String, Object> data = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}