package com.gsenc.api.controller;

import com.gsenc.api.model.DateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class DateUtilController {

    Logger logger = LoggerFactory.getLogger(DateUtilController.class);

    @PostMapping("/date/format")
    public DateFormat convertDateFormat(@RequestBody DateFormat dateFormat) throws ParseException {

        String beforePattern = dateFormat.getBeforePattern();
        String beforeDate = dateFormat.getBeforeDate();
        String afterPattern = dateFormat.getAfterPattern();

        SimpleDateFormat beforeFormat = new SimpleDateFormat(beforePattern);
        Date parse = beforeFormat.parse(beforeDate);

        SimpleDateFormat afterFormat = new SimpleDateFormat(afterPattern);
        String afterDate = afterFormat.format(parse);

        dateFormat.setAfterDate(afterDate);

        return dateFormat;
    }


}
