package com.rem.springai.services;

import com.rem.springai.model.*;

public interface OpenAiService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest capitalRequest);

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest capitalRequest);
}
