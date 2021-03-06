package chandu0101.scalajs.react.components.materialui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import materialui.Mui

import scala.scalajs.js

case class MuiFlatButton(onBlur: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         labelStyle: js.UndefOr[js.Any] = js.undefined,
                         onTouchStart: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         rippleColor: js.UndefOr[String] = js.undefined,
                         style: js.UndefOr[js.Any] = js.undefined,
                         label: js.UndefOr[String] = js.undefined,
                         ref: js.UndefOr[String] = js.undefined,
                         secondary: js.UndefOr[Boolean] = js.undefined,
                         onMouseUp: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         onTouchEnd: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         key: js.UndefOr[String] = js.undefined,
                         onMouseOver: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         linkButton: js.UndefOr[Boolean] = js.undefined,
                         onTouchTap: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         className: js.UndefOr[String] = js.undefined,
                         onMouseOut: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         hoverColor: js.UndefOr[String] = js.undefined,
                         onFocus: js.UndefOr[ReactEventH => Unit] = js.undefined,
                         disabled: js.UndefOr[Boolean] = js.undefined,
                         href: js.UndefOr[String] = js.undefined,
                         primary: js.UndefOr[Boolean] = js.undefined,
                         onMouseDown: js.UndefOr[ReactEventH => Unit] = js.undefined) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[MuiFlatButton](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.FlatButton)
    f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

