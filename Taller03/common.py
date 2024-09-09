import manim as m

WIDTH_EQ = m.MathTex(r"\mathrm{\Delta}_{x}=", r"\frac{b - a}{n}")
LEFT_EQ = m.MathTex(r"f(x)_{L}=", "a", "+", "i", r"\Delta_{x}")
RIGTH_EQ = m.MathTex(r"f(x)_{R}=", "a", "+", "(i-1)", r"\Delta_{x}")
MID_EQ = m.MathTex("f(x)_{T}=", "f(x)_{L}", "+", "f(x)_{R}")
SUM_EQ = m.MathTex(r"\sum_{i=1}^{4}", "f(x)", r"\Delta_{x}")

def delta(left: float, rigth:float, n: int):
  return (rigth - left)/n