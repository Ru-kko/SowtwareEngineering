import manim as m
from common import delta, WIDTH_EQ, LEFT_EQ, RIGTH_EQ, MID_EQ, SUM_EQ
import colors, point01 as ex 

axis=m.Axes(
  x_range=ex.GRAPHIC["x_range"],
  y_range=ex.GRAPHIC["y_range"],
  x_axis_config=ex.GRAPHIC["x_axis_config"]
).scale(0.5)

class Equation01(m.Scene):
  def construct(self):
    self.camera.background_color = colors.BACKGROUND

    # funcion
    base = m.MathTex(ex.BASE_EQUATION).move_to(m.UP * 3)
    self.play(m.Write(base))
    self.wait(1)

    # Grafica
    axis.set_color(colors.FOREGROUND)
    axis.move_to(m.DOWN * 2 + m.LEFT * 2)
    self.play(m.Write(axis),subcaption_duration=1)
    self.wait(1)
    graph=axis.plot(ex.Evaluate, color=colors.RED, x_range=[-4,4])
    self.play(m.Write(graph))
    self.wait(2)

    # Limites
    params = m.MathTex(ex.PARAMS).move_to(m.UP * 3 + m.RIGHT * 5)
    rigth_line=m.DashedLine(
      start=axis.c2p(3, ex.GRAPHIC["y_range"][0]),
      end=axis.c2p(3, ex.GRAPHIC["y_range"][1]),
      color=colors.BLUE
    )
    left_line=m.DashedLine(
      start=axis.c2p(-1, ex.GRAPHIC["y_range"][0]),
      end=axis.c2p(-1, ex.GRAPHIC["y_range"][1]),
      color=colors.BLUE
    )
    self.play(m.Write(params), m.Write(left_line), m.Write(rigth_line), subcaption_duration=0.2)

    self.wait(3)

    self.solveWidth()
    self.wait(3)

    left = self.solveLeft()
    self.wait(1)

    right = self.solveRigth()
    self.wait(1)

    mid = self.solveMid()
    self.wait(1)

    rectangles, width = 4, delta(-1,3,4)
    rects = []
    for i in range(1, rectangles + 1):
      x_left = -1 + ((i-1)*width)
      x_right = -1 + (width*i)
      x_mid = (x_right+x_left) / 2
      height = ex.Evaluate(x_mid)

      if height < 0:
        continue

      x_min_pixel = axis.c2p(x_mid - width / 2, 0)
      x_max_pixel = axis.c2p(x_mid + width / 2, 0)
      y_height_pixel = axis.c2p(0, height)

      rect_width = x_max_pixel[0] - x_min_pixel[0]
      rect_height = y_height_pixel[1] - axis.c2p(0, 0)[1]

      rect = m.Rectangle(
        width=rect_width, height=rect_height,
        color=m.YELLOW, fill_opacity=0.5
      )
      rects.append(rect)
      rect.move_to(axis.c2p(x_mid, height/2))

    self.play(mid.animate.to_edge(m.DOWN * 8 + m.RIGHT), m.FadeOut(left, right), *[m.GrowFromEdge(rect, m.DOWN) for rect in rects])
    self.wait(1)

    sum = self.solveSum()
    self.wait(1)

    sum_rect = m.SurroundingRectangle(sum, color=m.YELLOW, buff=0.5)
    self.play(m.Create(sum_rect))
    self.wait(1)
  
  def solveSum(self):
    sum_eq = SUM_EQ.copy().move_to(m.UP * 1.5)
    resolve = []
    for i in ex.SOLVE_SUM:
      resolve.append((m.MathTex(*i["equation"]).move_to(m.UP * 1.5), i["duration"]))
    
    self.play(m.Write(sum_eq))
    self.wait(5)

    last = sum_eq

    for i in resolve:
      self.play(m.TransformMatchingTex(last, i[0]))
      last = i[0]
      self.wait(i[1])
    return last
  
  def solveMid(self):
    mid_eq = MID_EQ.copy().move_to(m.UP * 1.5)
    resolve = []
    for i in ex.SOLVE_MID:
      resolve.append((m.MathTex(*i["equation"]).move_to(m.UP * 1.5), i["duration"]))
    
    self.play(m.Write(mid_eq))
    self.wait(2)

    last = mid_eq

    for i in resolve:
      self.play(m.TransformMatchingTex(last, i[0]))
      last = i[0]
      self.wait(i[1])

    self.play(last.animate.to_edge(m.RIGHT + m.DOWN * 4))
    return last
  
  def solveRigth(self):
    rigth_eq = RIGTH_EQ.copy().move_to(m.UP * 1.5)
    resolve = []
    for i in ex.SOLVE_RIGTH:
      resolve.append((m.MathTex(*i["equation"]).move_to(m.UP * 1.5), i["duration"]))
    
    self.play(m.Write(rigth_eq))
    self.wait(5)

    last = rigth_eq

    for i in resolve:
      self.play(m.TransformMatchingTex(last, i[0]))
      last = i[0]
      self.wait(i[1])

    self.play(last.animate.to_edge(m.RIGHT + m.DOWN * 6))
    return last

  def solveLeft(self):
    left_eq = LEFT_EQ.copy().move_to(m.UP * 1.5)
    resolve = []
    for i in ex.SOLVE_LEFT:
      resolve.append((m.MathTex(*i["equation"]).move_to(m.UP * 1.5), i["duration"]))
    
    self.play(m.Write(left_eq))
    self.wait(5)

    last = left_eq

    for i in resolve:
      self.play(m.TransformMatchingTex(last, i[0]))
      last = i[0]
      self.wait(i[1])
    
    self.play(last.animate.to_edge(m.RIGHT + m.DOWN * 8))
    return last

  def solveWidth(self):
    width_eq = WIDTH_EQ.copy().move_to(m.UP*1.5)
    resolve = []

    for i in ex.SOLVE_WIDTH:
      resolve.append((m.MathTex(*i["equation"]).move_to(m.UP * 1.5), i["duration"]))

    self.play(m.Write(width_eq))
    self.wait(1)

    last = width_eq

    for i in resolve:
      self.play(m.TransformMatchingTex(last, i[0]))
      last = i[0]
      self.wait(i[1])
    
    self.play(last.animate.to_edge(m.RIGHT))
    return last


class Intro(m.Scene):
  def construct(self):
    title = m.Text("Taller 3", font_size=96)
    subtitle = m.Text("Cálculo Integral", font_size=48)

    subtitle.next_to(title, m.DOWN, buff=0.5)

    self.play(m.Write(title), m.Write(subtitle))
    self.wait(2)

    names = m.VGroup(
      m.Text("Karen Stefania Rivera Carrero", font_size=30),
      m.Text("Jose Sebastian Vera", font_size=30)
    )

    names.arrange(m.DOWN, center=False).next_to(subtitle, m.DOWN, buff=1)
    self.play(m.Write(names))

    self.wait(2)

