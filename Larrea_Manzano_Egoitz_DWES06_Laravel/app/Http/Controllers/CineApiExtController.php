<?php

namespace App\Http\Controllers;

use App\Models\Cine;
use Illuminate\Support\Facades\Http;
use App\Models\Respuesta;
use Exception;
use Illuminate\Http\Response;
use Illuminate\Http\Request;
use PHPUnit\Framework\MockObject\Rule\Parameters;

class CineApiExtController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index(Request $request)
    {
        $pelicula=$request->getQueryString();
        $url='localhost:8080/api/datos?'.$pelicula;
        $response = Http::get($url);
        $posts = $response->json();
        if($response->failed()) {
            $respuesta = new Respuesta();
            $respuesta->setStatusCode(Response::HTTP_BAD_REQUEST);
            $respuesta->setError(true);
            $respuesta->setMensajeError("Peticion no valida");
            $respuesta->setRespuesta("");
        }else{
        

            $respuesta = new Respuesta();
            $respuesta->setStatusCode(Response::HTTP_OK);
            $respuesta->setError($posts['error']);
            $respuesta->setMensajeError($posts['mesanjeError']);
            $respuesta->setRespuesta(json_decode($posts['respuesta'], true));

        }
        return response()->json($respuesta);
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {

    }

    /**
     * Display the specified resource.
     */
    public function show(Cine $cine)
    {

        
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Cine $cine)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Cine $cine)
    {
       
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Cine $cine)
    {
        
    }
}
