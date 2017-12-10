package eastosaka.hellowor.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class IndexController {

    @RequestMapping("/", method = [RequestMethod.GET])
    fun index(): ModelAndView {
        val mav = ModelAndView("index")
        mav.addObject("variable","k")
        return mav
    }

}