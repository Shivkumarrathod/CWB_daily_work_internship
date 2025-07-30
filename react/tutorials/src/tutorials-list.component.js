import { useEffect, useState } from 'react';
import TutorialsService from './services/tutorials.service'

const TutorialsListComponent=()=>{

    const [tutorials,setTutorials]=useState([]);
   
 useEffect(()=>{
        getAllTutorials();
 },[]);
    const getAllTutorials= () =>{

        TutorialsService.getALL()
        .then((response)=>{
            console.log(response);
            setTutorials(response.data);

        })
        .catch((error)=>{
            console.log(error);
        })
    };

return(
 <>
    <h1>Tutorials Component List </h1>
    {tutorials && tutorials.map((tutorial,index) =>(
            <p key={tutorial.id}>{tutorial.title}</p>
    )

        )
    }   
 </>

);


}



export default TutorialsListComponent;
