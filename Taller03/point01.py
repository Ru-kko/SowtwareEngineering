BASE_EQUATION = r"f(x)=2x^2-2" # Funcion inicial
PARAMS = r"[-1,3], n=4"

# Resolviendo Delta x
SOLVE_WIDTH = [
    {"equation": (r"\mathrm{\Delta}_{x}=", r"\frac{3-(-1)}{4}"), "duration": 1},
    {"equation": (r"\mathrm{\Delta}_{x}=", r"\frac{4}{4}"), "duration": 1},
    {"equation": (r"\mathrm{\Delta}_{x}=", r"1"), "duration": 1},
]


# Resolviendo  Lado Izquierdo
SOLVE_LEFT = [
    {"equation": (r"f(x)_{L}=", "-1", "+", "i", "1"), "duration": 1},
    {"equation": (r"f(x)_{L}=", "-1", "+", "i"), "duration": 1},
    {"equation": (r"f(x)_{L}=", "i", "-1"), "duration": 1},
]



# Resolviendo  Lado Derecho
SOLVE_RIGTH = [
    {"equation": (r"f(x)_{R}=", "-1", "+", "(i-1)", "1"), "duration": 1},
    {"equation": (r"f(x)_{R}=", "-1", "+", "i", "-", "1"), "duration": 1},
    {"equation": (r"f(x)_{R}=", "-2", "+", "i"), "duration": 1},
]


# Resolviendo el medio
SOLVE_MID = [
    {"equation": (r"f(x)_{T}=", "(-1+i)", "+", "(-2+i)"), "duration": 1}, 
    {"equation": (r"f(x)_{T}=", "-1", "+", "i", "-", "2" "+", "i"), "duration": 1}, 
    {"equation": (r"f(x)_{T}=", "-3", "+", "2i"), "duration": 1}, 
]


# sumatorio de reaiman
SOLVE_SUM = [
    {"equation": (r"\sum_{i=1}^{4}", "(", "x^{2}", "-", "2", ")", "1"), "duration": 1},
    {"equation": (r"\sum_{i=1}^{4}", "(", "(-3+2i)^{2}", "-", "2", ")", "1"), "duration": 3},
    {"equation": (r"\sum_{i=1}^{4}", "(", "(", "4i^{2}", "-", "12i", "+", "9", ")", "-", "2", ")", "1"), "duration": .5},
    {"equation": (r"\sum_{i=1}^{4}", "4i^{2}", "-", "12i", "+", "7"), "duration": .5},
    {"equation": ("4", r"\sum_{i=1}^{4}", "i^{2}", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .2},
    {"equation": ("4", r"\frac{4(4+1)(8+1)}{6}", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .2},
    {"equation": ("4", r"\frac{4*5*9}{6}", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("4", r"\frac{180}{6}", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .2},
    {"equation": ("4", "*", "30", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "12", r"\sum_{i=1}^{4}", "i", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "12", r"\frac{4(4+1)}{2}", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "12", r"\frac{4*5}{2}", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "12", r"\frac{20}{2}", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "12", "*", "10", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "120", "+", r"\sum_{i=1}^{4}", "7"), "duration": .1},
    {"equation": ("120", "-", "120", "+", "4", "*", "7"), "duration": .1},
    {"equation": ("120", "-", "120", "+", "28"), "duration": .1},
    {"equation": ("28"), "duration": .1},
]



# grafica
GRAPHIC = {
    "x_range": [-5,5,1], # El rango de unidades en X, izquierda, derecha, cuantas unidades por punto
    "y_range": [-3,20,2], # unidades en Y abajo, arriba, cuantas unidades por paso
    "x_axis_config": {
        "numbers_to_include": [-1,3] # resaltar numeros en el eje X
    },
}

# N
PARTITIONS = 4

# Funcion para evaluar cualquier punto
def Evaluate(x: float):
    return 2*(x*x)-2