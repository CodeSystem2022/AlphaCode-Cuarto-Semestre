import math
# manejo de valores infinitos
infinitos_positivo = float('inf')
print(f'Infinito positivo: {infinitos_positivo}')
print(f'Es infinito: {math.isinf(infinitos_positivo)}')

infinito_negativo = float('-inf')
print(f'Infinito negativo: {infinito_negativo}')
print(f'Es infinito?: {math.isinf(infinito_negativo)}')
