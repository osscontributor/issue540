package demo

class DemoController {

    def createWidget(Widget w) {
        render "The date that was bound: ${w.initialDate}"
    }
}

class Widget {
    Date initialDate
}
