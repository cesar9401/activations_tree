# Ejemplo arbol de activaciones (Compi2)

### Ejecutar con:
```sh
java -jar Activaciones.jar input.txt
```

### Ejemplo archivo input.txt
```txt
programa NOMBRE

	procedimiento suma (a : integer, b : integer)
	begin
		var x, y, z : integer;
		x := resta(10, 20);
		y := multiplicacion(10, 10);
	end

	procedimiento multiplicacion (param : string)
	begin
		var x, y : integer;
		x := resta(19, 20);
	end

	procedimiento resta (param : boolean)
	begin
		var x, y, z : integer;
	end

	procedimiento division (a: integer, b: integer)
	begin
		a := suma(10, 10);
	end

	begin
		var x, y, z : integer;
		suma();
		x := division(20, 10);
	end
```